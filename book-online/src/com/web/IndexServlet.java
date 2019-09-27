package com.web;

/**
 * @author dqy
 * @ClassName IndexServlet
 * @Description TODO
 * @Date 2019/9/27
 * @Version 1.0
 **/

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book[] books = {
                new Book("神洲异事录", "5.jpg", "若风95"),
                new Book("迷失蔚蓝", "4.jpg", "茶叔"),
                new Book("我能复制万族天赋", "1.jpg", "淡味冰激凌"),
                new Book("放开那个女巫", "2.jpg", "二目"),
                new Book("间客", "3.jpg", "猫腻"),
                new Book("神洲异事录", "5.jpg", "若风95"),
                new Book("迷失蔚蓝", "4.jpg", "茶叔"),
                new Book("我能复制万族天赋", "1.jpg", "淡味冰激凌"),
                new Book("放开那个女巫", "2.jpg", "二目"),
                new Book("间客", "3.jpg", "猫腻")


        };
        List<Book> bookList = (List<Book>) Arrays.asList(books);
        req.setAttribute("bookList", bookList);
        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
}

