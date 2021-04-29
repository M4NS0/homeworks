<?php
//http://www.ferdinandiz.com.br/deletar_aula12.php?id=12
	include "conexao_aula12.php";
	echo "<br>";
	if(isset($_GET['id'])){
		$id = $_GET["id"];
		$consulta = "SELECT `nome` FROM `aula12` WHERE `id`='{$id}'";
		$result = mysqli_query($conexao, $consulta);
		if($registro = mysqli_fetch_array($result)){
			$sql = "DELETE FROM `aula12` WHERE `id` = ?";
			$var = $conexao->prepare($sql);
			$var->bind_param('i',$id);
			if($var->execute()){
				echo "excluido";
			} else echo 'erro';
		} else  echo 'inexistente';
		mysqli_close($conexao);
	}	else echo 'naoExiste';
?>