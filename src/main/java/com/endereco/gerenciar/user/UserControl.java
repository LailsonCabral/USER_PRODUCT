package com.endereco.gerenciar.user;

import com.endereco.gerenciar.produto.Produto;
import com.endereco.gerenciar.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UserControl {

    @Autowired
    UserRepository userRepository;

    ProdutoRepository produtoRepository;

    @GetMapping("/listar")
    public List<User> userList() {
        return userRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public User cadastrar(@RequestBody User us){
        return userRepository.save(us);
    }

    @GetMapping("/usuario_produtos/{id}")
    public User listarPorID(@PathVariable Integer id){
        var user = userRepository.findById(id);
        return user.get();
    }

}
