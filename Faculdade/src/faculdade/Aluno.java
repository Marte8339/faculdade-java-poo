/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author Talvez
 */
public class Aluno extends Pessoa{
    private String aprovado;

    public Aluno(String nome, int dt_nasc, String cpf, char genero, boolean registro) {
        super(nome, dt_nasc, cpf, genero, registro);
    }
    
    @Override
    public void setRegistro(boolean registro) {
        super.setRegistro(registro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isRegistro() {
        return super.isRegistro(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setGenero(char genero) {
        super.setGenero(genero); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public char getGenero() {
        return super.getGenero(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getCpf() {
        return super.getCpf(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDt_nasc(int dt_nasc) {
        super.setDt_nasc(dt_nasc); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getDt_nasc() {
        return super.getDt_nasc(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNome() {
        return super.getNome(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
        @Override
    public String verifGenero(char genero) {
        return super.verifGenero(genero); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String verifRegistro(boolean registro) {
        return super.verifRegistro(registro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int calcIdade(int dt_nasc) {
        return super.calcIdade(dt_nasc); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public String verifAprovado(float nota1, float nota2, float nota3, int faltas){
        float media = (nota1 + nota2 + nota3)/3;
        
        if(media >= 6 && faltas <= 12){
            return aprovado = "|Aprovado| Media: " + media + " faltas: " + faltas;
        }
        
        return aprovado = "|Reprovado|\nMedia: " + media + " faltas: " + faltas;
    }
    
    @Override
    public void mostrar() {
        super.mostrar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(aprovado);
    }
}
