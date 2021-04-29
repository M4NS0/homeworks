<?php
//http://www.ferdinandiz.com.br/consulta_aula12.php?id=1
	include "conexao_aula12.php";
	$json = array();
	
	if(isset ($_GET["id"])){
		$id = $_GET["id"];
		$consulta = "SELECT `id`, `nome`, `telefone` FROM `aula12` WHERE `id`='{$id}'";
		$result = mysqli_query($conexao, $consulta);
		if($registro = mysqli_fetch_array($result)){
			$json = array ('id' => $registro['id'], 
			'nome' => $registro['nome'],
			'telefone' => $registro['telefone']);
		}else {
			$json = array ('id' => '0', 
			'nome' => 'Não registrado!',
			'telefone' => 'Não registrado');
		}
		mysqli_close($conexao);
		echo json_encode($json);
		
	} else{
		$json = array ('id' => '0', 
			'nome' => 'Não registrado!',
			'telefone' => 'Não registrado');
		echo json_encode($json);
	}
?>