using CadastroVacinacao.Entidades;
using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroVacinacao.DAO
{
    class UsuarioDao
    {
        MySqlCommand sql;
        String sqlStr = "";
        Conexao conexao = new Conexao();



        public void Salvar(Usuario objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "INSERT INTO user_info (email, usuario, senha, recuperacao) VALUES (@EMAIL,@NOME,@SENHA,@RECUPERACAO)";
                sql = new MySqlCommand(sqlStr, conexao.con);
                sql.Parameters.AddWithValue("@EMAIL", objeto.Email);
                sql.Parameters.AddWithValue("@NOME", objeto.Nome);
                sql.Parameters.AddWithValue("@SENHA", objeto.Senha);
                sql.Parameters.AddWithValue("@RECUPERACAO", objeto.ChaveDeRecuperacao);
                sql.ExecuteNonQuery();
                conexao.FecharConexao();

            } catch (Exception)
            {
                throw;
            }
        }
        public void Editar(Usuario objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "UPDATE user_info SET email=@EMAIL, nome=@NOME, senha=@SENHA, recuperacao=@RECUPERACAO WHERE id=@ID";
                sql = new MySqlCommand(sqlStr, conexao.con);
                sql.Parameters.AddWithValue("@EMAIl", objeto.Email);
                sql.Parameters.AddWithValue("@NOME", objeto.Nome);
                sql.Parameters.AddWithValue("@SENHA", objeto.Senha);
                sql.Parameters.AddWithValue("@RECUPERACAO", objeto.ChaveDeRecuperacao);
                sql.ExecuteNonQuery();
                conexao.FecharConexao();

            } catch (Exception)
            {
                throw;
            }
        }
        public DataTable Buscar(Usuario objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT * FROM user_info WHERE nome LIKE @NOME";
                sql = new MySqlCommand(sqlStr, conexao.con);
                sql.Parameters.AddWithValue("@NOME", objeto.Nome + "%");
                MySqlDataAdapter da = new MySqlDataAdapter();
                da.SelectCommand = sql;
                DataTable dt = new DataTable();
                da.Fill(dt);
                return dt;

            } catch (Exception)
            {
                throw;
            }
        }

        public DataTable VerificarComNomeSenha(String usuarioStr, String senhaStr)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT * FROM user_info WHERE usuario='" + usuarioStr + "' and senha='" + senhaStr + "'";
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

        public DataTable ListarSenha(String usuarioStr, String fraseStr)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT senha FROM user_info WHERE usuario='" + usuarioStr + "' and senha='" + fraseStr + "'";
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

        public DataTable VerificarRecuperacao(String usuarioStr, String palavraStr)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT * FROM user_info WHERE usuario='" + usuarioStr + "' and recuperacao='" + palavraStr + "'";
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

        // não usados mas implementado para proximo codigo //

        public void Excluir (Usuario objeto )
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "DELETE FROM user_info WHERE id=@ID";
                sql = new MySqlCommand(sqlStr, conexao.con);
                sql.Parameters.AddWithValue("@ID", objeto.Id);
                sql.ExecuteNonQuery();
                conexao.FecharConexao();

            } catch (Exception)
            {
                throw;
            }
        }

        public DataTable Listar()
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT * FROM user_info";
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

    }
}
