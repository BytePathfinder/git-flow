package com.qywm.acl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *  工程：git-flow
 *  包名：com.qywm.acl.controller
 * </pre>
 *
 * @author 徐彪 1534089606@qq.com
 * @version 1.0.0
 * @apiNote UserController
 * @since 2023/8/7 11:18
 */
@RestController
@RequestMapping("/v1/users")
public class UserController {

    @GetMapping
    public String getUsers() {
        return "用户列表";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable String id) {
        return "用户" + id;
    }
}
