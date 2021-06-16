using System;
using System.Data;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;
using ProjetoCrud.Entidades;

namespace ProjetoCrud.DAO
{
    class ClienteDAO
    {
        MySqlCommand sql;
        String sqlStr = "";
        Conexao conexao = new Conexao();
    
        public DataTable Listar()
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT * FROM clientes";
                sql = new MySqlCommand(sqlStr, conexao.con);
                MySqlDataAdapter da = new MySqlDataAdapter();
                da.SelectCommand = sql;
                DataTable dt = new DataTable();
                da.Fill(dt);
                return dt;

            }
            catch (Exception)
            {
                throw;
            }

        }

        public void Salvar(Cliente objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "INSERT INTO clientes (nome,sexo,nascimento) VALUES (@NOME, @SEXO, @NASCIMENTO)";
                sql = new MySqlCommand(sqlStr, conexao.con);
                sql.Parameters.AddWithValue("@NOME", objeto.Nome);
                sql.Parameters.AddWithValue("@SEXO", objeto.Sexo);
                sql.Parameters.AddWithValue("@NASCIMENTO", objeto.Nascimento);
                sql.ExecuteNonQuery();
                conexao.FecharConexao();

            }
            catch (Exception)
            {
                throw;
            }
        }

        public void Editar(Cliente objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "UPDATE clientes SET nome=@NOME, sexo=@SEXO nascimento=@NASCIMENTO WHERE id=@ID";
                sql = new MySqlCommand(sqlStr, conexao.con);
                sql.Parameters.AddWithValue("@NOME", objeto.Nome);
                sql.Parameters.AddWithValue("@SEXO", objeto.Sexo);
                sql.Parameters.AddWithValue("@NASCIMENTO", objeto.Nascimento);
                sql.Parameters.AddWithValue("@ID", objeto.Id);
                sql.ExecuteNonQuery();
                conexao.FecharConexao();

            }
            catch (Exception)
            {
                throw;
            }

        }

        public void Excluir(Cliente objeto)
        {

            try
            {
                conexao.AbrirConexao();
                sqlStr = "DELETE FROM clientes WHERE id=@ID";
                sql.Parameters.AddWithValue("@ID", objeto.Id);
                sql.ExecuteNonQuery();
                conexao.FecharConexao();

            }
            catch (Exception)
            {
                throw;
            }
        }

        public DataTable Buscar(Cliente objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT * FROM clientes WHERE nome LIKE @NOME";
                sql.Parameters.AddWithValue("@NOME", objeto.Nome + "%");
                MySqlDataAdapter da = new MySqlDataAdapter();
                da.SelectCommand = sql;
                DataTable dt = new DataTable();
                da.Fill(dt);
                return dt;
            }
            catch (Exception)
            {
                throw;
            }
        }
    }
}
