<?php

function conectar(){
	
	$host = "localhost";
	$bd = "ferdina1_cmp1144";
	$user = "ferdina1_alunos";
	$senha = "abcABC123!@#";
	
	$con = new mysqli($host,$user,$senha,$bd);
	
	if(!$con){
		echo "Falha ao conectar!!";
	}else echo "Conectado! <br>";
	
	return $con;
		
}

$conexao = conectar();

?>
