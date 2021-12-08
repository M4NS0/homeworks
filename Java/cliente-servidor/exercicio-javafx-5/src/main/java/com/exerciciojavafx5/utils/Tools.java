package com.exerciciojavafx5.utils;

import com.exerciciojavafx5.control.bean.AlunoBean;
import com.exerciciojavafx5.model.Aluno;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tools {
    public List<AlunoBean> convertToBeanList(List<Aluno> alunos) {
        List<AlunoBean> alunosBean = new ArrayList<>();

        for (Aluno aluno : alunos) {
            AlunoBean alunoBean = new AlunoBean();
            alunoBean.setId(aluno.getId());
            alunoBean.setNome(aluno.getNome());
            alunoBean.setDataNascimento(converToPrettyDate(aluno.getDataNascimento()));
            alunoBean.setMatricula(aluno.getMatricula());
            alunosBean.add(alunoBean);
        }
        return alunosBean;
    }

    private String converToPrettyDate(Date dataNascimento) {
        String [] dateParts = dataNascimento.toString().split("-");
        return dateParts[2] + "/" + dateParts[1] + "/" + dateParts[0];
    }

    public Aluno convertBeanToObject(AlunoBean alunoBean) {
        Aluno aluno = new Aluno();
        Tools tools = new Tools();
        aluno.setId(alunoBean.getId());
        aluno.setNome(alunoBean.getNome());
        aluno.setDataNascimento(tools.stringToDate(alunoBean.getDataNascimento()));
        aluno.setMatricula(alunoBean.getMatricula());
        return aluno;
    }

    private Date stringToDate(String dataNascimento) {
        Date date = new Date();
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = formatter.parse(dataNascimento);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public String dateToString(Date dataNascimento) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(dataNascimento);
        return date;
    }
}
