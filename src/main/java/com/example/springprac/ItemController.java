package com.example.springprac;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/* 3-step
1. repository 만들기
2. 원하는 클래스에 repository 등록
3. repository 입출력 문법 쓰기
 */

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String list(Model model) {

        List<Item> result = itemRepository.findAll();
        System.out.println(result.get(0));
        System.out.println(result.get(0).Name);
        System.out.println(result.get(0).price);


        var b = new ArrayList<>();
        b.add(30);
        b.add(40);
        System.out.println(b.get(1));

        //ArrayList<Integer> c = new ArrayList<>();
        //ArrayList<Object> d = new ArrayList<>();
        //List<Object> e = new ArrayList<>();


        model.addAttribute("name", "비싼 바지");
        return "list.html";
    }

}