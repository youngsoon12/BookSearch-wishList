package com.book.service;

import com.book.model.WishList;
import com.book.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    @Autowired
    private WishListRepository wishListRepository;

    // 등록
    public WishList saveWishList(WishList wishList) {
        return wishListRepository.save(wishList);
    }

    // 조회
    public List<WishList> getAllWishLists() {
        return (List<WishList>) wishListRepository.findAll();
    }

    // 삭제
    public void deleteWishList(int id) {
        if (wishListRepository.existsById(id)) {
            wishListRepository.deleteById(id);
        } else {
            throw new RuntimeException("WishList not found with id: " + id);
        }
    }
}