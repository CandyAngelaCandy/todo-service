<<<<<<< HEAD
//package com.thoughtworks.training.HuangYanyan.todoserice.controller;
//
//import com.thoughtworks.training.HuangYanyan.todoserice.model.TodoItem;
//import com.thoughtworks.training.HuangYanyan.todoserice.repository.TodoRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Date;
//import java.util.List;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@RunWith(SpringRunner.class)
//public class todolistTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private TodoRepository todoRepository;
//
//    @Test
//    public void shouleReturnItemList() throws Exception {
//
//
//        List<TodoItem> todolist = new ArrayList<TodoItem>() {{
//            add(new TodoItem(0, "hello 0", new Date(), false, false, false, null, null));
//        }};
//
//        when(todoRepository.findAll()).thenReturn(todolist);
=======
package com.thoughtworks.training.HuangYanyan.todoserice.controller;

import com.thoughtworks.training.HuangYanyan.todoserice.model.TodoItem;
import com.thoughtworks.training.HuangYanyan.todoserice.repository.TodoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class todolistTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TodoRepository todoRepository;

    @Test
    public void shouleReturnItemList() throws Exception {


//        List<TodoItem> todolist = new ArrayList<TodoItem>() {{
//            add(new TodoItem(0,"foo"));
//        }};
//
//        when(todoRepository.list()).thenReturn(todolist);
>>>>>>> 143ebdd... add user Authentication and Authorization test
//
//        MvcResult result = mockMvc.perform(get("/todolist"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(jsonPath("$.length()").value(1))
//                .andExpect(jsonPath("$[0].id").value(0))
//                .andExpect(jsonPath("$[0].text").value("foo"))
<<<<<<< HEAD
//                .andReturn();
//    }
//
//    @Test
//    public void shouldReturnItemListInAuthorized() throws Exception {
//
//        List<TodoItem> todoItems = new ArrayList<TodoItem>() {{
//            add(new TodoItem(0, "foo", new Date(), false, false, false, null, null));
//        }};
//
//        when(todoRepository.findAll()).thenReturn(todoItems);
//
//        SecurityContextHolder.getContext().setAuthentication(
//                new UsernamePasswordAuthenticationToken("user",null
//                        , Collections.emptyList()));
//
//        mockMvc.perform(get("/todolist"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(jsonPath("$.length()").value(1))
//                .andExpect(jsonPath("$[0].id").value(0))
//                .andExpect(jsonPath("$[0].text").value("foo"))
//                .andReturn();
//
//    }
//
//
//
//
//}
=======
//                  .andReturn();
    }
}
>>>>>>> 143ebdd... add user Authentication and Authorization test
