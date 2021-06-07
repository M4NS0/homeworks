using CadastroVacinacao.Entidades;
using MySql.Data.MySqlClient;
using System;
using System.Data;


namespace CadastroVacinacao.DAO
{
    class RegistroDao
    {
        MySqlCommand sql;
        String sqlStr = "";
        Conexao conexao = new Conexao();

        public void Salvar(Registro objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "INSERT INTO registro (idVacina, nome, dataVacinacao) VALUES (@IDVACINA,@NOME,@DATAVACINACAO)";
                sql = new MySqlCommand(sqlStr, conexao.con);
                sql.Parameters.AddWithValue("@IDVACINA", objeto.IdVacina);
                sql.Parameters.AddWithValue("@NOME", objeto.Nome);
                sql.Parameters.AddWithValue("@DATAVACINACAO", objeto.DataVacinacao);
                sql.ExecuteNonQuery();
                conexao.FecharConexao();

            } catch (Exception)
            {
                throw;
            }
        }
        public void Editar(Registro objeto, int id)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "UPDATE registro SET idVacina=@IDVACINA, nome=@NOME, dataVacinacao=@DATAVACINACAO WHERE id=" + id;
                sql = new MySqlCommand(sqlStr, conexao.con);
                sql.Parameters.AddWithValue("@IDVACINA", objeto.IdVacina);
                sql.Parameters.AddWithValue("@NOME", objeto.Nome);
                sql.Parameters.AddWithValue("@DATAVACINACAO", objeto.DataVacinacao);
                sql.ExecuteNonQuery();
                conexao.FecharConexao();

            } catch (Exception)
            {
                throw;
            }
        }
        public DataTable Buscar(Registro objeto)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "SELECT * FROM registro WHERE nome LIKE @NOME";
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

        public void Excluir (int id)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "DELETE FROM registro WHERE id=" + id;
                sql = new MySqlCommand(sqlStr, conexao.con);
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
                sqlStr = "select reg.id, reg.nome, reg.dataVacinacao, vac.nome, vac.fabricante, vac.origem, vac.dose from registro reg join vacina vac on reg.idVacina = vac.id;";
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

        public DataTable GetRegistroByString(string value)
        {
            try
            {
                conexao.AbrirConexao();
                sqlStr = "select reg.id, reg.nome, reg.dataVacinacao, vac.nome, vac.fabricante, vac.origem, vac.dose " +
                         "from registro reg " +
                         "join vacina vac on reg.idVacina = vac.id " +
                         "where vac.nome like '" + value + "%' " +
                         "or reg.id like '" + value + "%' " +
                         "or reg.dataVacinacao like '" + value + "%' " +
                         "or reg.nome like '" + value + "%' " +
                         "or vac.fabricante like '" + value + "%' " +
                         "or vac.origem like '" + value + "%';";
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
