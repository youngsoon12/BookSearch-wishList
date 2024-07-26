package com.book.controller;

import com.book.model.WishList;
import com.book.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/saveBook")
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> saveBook(
        @RequestParam String title,
        @RequestParam String link,
        @RequestParam String image,
        @RequestParam String author,
        @RequestParam String publisher,
        @RequestParam String pubdate,
        @RequestParam String description,
        @RequestParam String query
    ) {
        WishList wishList = new WishList();
        wishList.setTitle(title);
        wishList.setLink(link);
        wishList.setImage(image);
        wishList.setAuthor(author);
        wishList.setPublisher(publisher);
        wishList.setPubdate(pubdate);
        wishList.setDescription(description);

        wishListService.saveWishList(wishList);

        // 성공적으로 저장된 경우 JSON 응답 반환
        return ResponseEntity.ok("{\"message\":\"Book saved successfully!\"}");
    }

    @GetMapping("/wishlist")
    public String viewWishList(Model model) {
        List<WishList> wishLists = wishListService.getAllWishLists();
        model.addAttribute("wishLists", wishLists);
        return "wishList"; // JSP 파일 이름 (wishList.jsp)
    }
}