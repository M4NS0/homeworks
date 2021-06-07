using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroVacinacao.Entidades
{
    class Usuario
    {
        int id;
        String email, nome, senha, chaveDeRecuperacao;

        public int Id { get => id; set => id = value; }
        public string Email { get => email; set => email = value; }
        public string Nome { get => nome; set => nome = value; }
        public string Senha { get => senha; set => senha = value; }
        public string ChaveDeRecuperacao { get => chaveDeRecuperacao; set => chaveDeRecuperacao = value; }
    }
}
