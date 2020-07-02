#!/bin/sh

repName=$(echo "Workspaces,Matriz.Curricular,Projetos,M4ns0.github.io")
crud=$(echo "Create,Remove,Update,Delete")
yad --title="Nome do Repositório" \
--form --separator="," --item-separator="," \
--field="Nome do Repositório:CB" \
--field="CRUD:CBE" \
--field="Comments:TXT" \
"$repName" "$crud" "Escreva um comentário adicional" > config

NAME=`cat config | awk -F',' '{print $1}'`
CRUD=`cat config | awk -F',' '{print $2}'`
COMMENT=`cat config | awk -F',' '{print $3}'`

cd ~/$USR/$NAME
git add .
git commit -m "$CRUD - $COMMENT"
git status
git push


echo Foi feito um $CRUD no Repositório $NAME com comentário: "$COMMENT"
