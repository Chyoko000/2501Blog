package com.situ.blog.servlet;

import com.situ.blog.pojo.Blog;
import com.situ.blog.pojo.query.BlogQuery;
import com.situ.blog.util.JSONUtil;
import com.situ.blog.util.MyBeanUtil;
import com.situ.blog.util.PageResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/blog")
public class BlogServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        switch (method) {
            case "selectByPage":
                selectByPage(req, resp);
                break;
            /*case "toList":
                toList(req, resp);
                break;
            case "toAdd":
                toAdd(req, resp);
                break;*/
        }
    }

    // /blog?method=selectByPage&page=1&limit=10&name=abc
    private void selectByPage(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("BlogServlet.selectByPage");
        //Map<String, String[]> parameterMap = req.getParameterMap();
        //page:1                blogQuery.setPage(1)
        //limit:1               blogQuery.setLimit(1)
        //name: zhangsan        blogQuery.setName("zhangsan")
        /*
        String page = req.getParameter("page");
        String limit = req.getParameter("limit");
        String name = req.getParameter("name");
        BlogQuery blogQuery = new BlogQuery();
        blogQuery.setPage(page);
        blogQuery.setLimit(limit);
        blogQuery.setName(name);
         */
        BlogQuery blogQuery = MyBeanUtil.copyToBean(req, BlogQuery.class);
        System.out.println(blogQuery);
        //PageResult<Blog> pageResult =  blogService.selectByPage(blogQuery);
        //JSONUtil.toJSON(resp, pageResult);
    }

    /*private void toAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/blog_add.jsp").forward(req, resp);
    }

    private void toList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/blog_list.jsp").forward(req, resp);
    }*/

}

