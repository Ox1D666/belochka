package ru.cleverence.acceptance.servlet;

import ru.cleverence.acceptance.model.Product;
import ru.cleverence.acceptance.store.MemStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", MemStore.instOf().findAll());
        req.getRequestDispatcher("products.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        MemStore.instOf().save(new Product(0, req.getParameter("name"),
                Integer.parseInt(req.getParameter("quantity")), req.getParameter("desc")));
        resp.sendRedirect(req.getContextPath() + "/product/edit.do");
    }
}
