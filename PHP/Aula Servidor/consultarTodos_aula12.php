<?php
//http://www.ferdinandiz.com.br/consultarTodos_aula12.php
	include "conexao_aula12.php";
	$json = array();
	
	$consulta = "SELECT * FROM `aula12`";
	$result = mysqli_query($conexao, $consulta);
	
	while($registro = mysqli_fetch_array($result)){
		
		$json['aula12'][] = array('id' => $registro['id'], 
			'nome' => $registro['nome'],
			'telefone' => $registro['telefone']);
			
	}
	
	mysqli_close($conexao);
	echo json_encode($json);

?>