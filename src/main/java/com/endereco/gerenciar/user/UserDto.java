package com.endereco.gerenciar.user;

import com.endereco.gerenciar.produto.ProdutoDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class UserDto {
    private String nome;
    private String cpf;
    private List<ProdutoDto> Produto;

}
