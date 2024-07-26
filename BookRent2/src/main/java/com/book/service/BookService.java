package com.book.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class BookService {

    private final RestTemplate restTemplate;
    private final String clientId = "AQ7rUMbA6GB7_wUptzip"; // 네이버에서 발급받은 Client ID
    private final String clientSecret = "iVPmcZm4E1"; // 네이버에서 발급받은 Client Secret
    
    @Autowired
    public BookService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Book[] searchBooks(String query) {
    	String url = "https://openapi.naver.com/v1/search/book.json?query=" + query;

        // 헤더에 API 키 추가
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Naver-Client-id", clientId);  // 헤더에 API 키를 설정
        headers.set("X-Naver-Client-Secret",clientSecret);
        
        // HttpEntity에 헤더 추가
        HttpEntity<String> entity = new HttpEntity<>(headers);

        // GET 요청 보내기
        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.GET, entity,Map.class);
        
        Map<String, Object> body = response.getBody();
        Object items = body.get("items");
        
     // Convert 'items' to Book[]
        ObjectMapper mapper = new ObjectMapper();
        Book[] books = mapper.convertValue(items, Book[].class);

        return books;
    }
}
