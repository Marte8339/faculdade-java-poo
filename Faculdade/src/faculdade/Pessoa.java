/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author Talvez
 */
public class Pessoa {
    private String nome;
    private int dt_nasc;
    private String cpf;
    private char genero;
    private boolean registro;

    public Pessoa(String nome, int dt_nasc, String cpf, char genero, boolean registro) {
        this.nome = nome;
        this.dt_nasc = dt_nasc;
        this.cpf = cpf;
        this.genero = genero;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isBlank()){
            System.out.println("Erro");
        }else{
            this.nome = nome;
        }
    }

    public int getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(int dt_nasc) {
        if(dt_nasc == 0){
            System.out.println("Erro");
        }else{
            this.dt_nasc = dt_nasc;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.isBlank()){
            System.out.println("Erro");
        }else{
            this.cpf = cpf;
        }
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }
    
    public int calcIdade(int dt_nasc){
        return  2024 - dt_nasc;
    }
    
    public String verifRegistro(boolean registro){
        if(registro == true){
            return "\nRegistrado";
        }
        return "\nDesligado";
    }
    
    public String verifGenero(char genero){
        if(genero >= 'a' && genero <= 'z'){
            genero-=32;
        }
        
        if(genero == 'F'){
            return "Feminino";
        }else{
            return "Masculino";
        }
    }
    
    public void mostrar(){
        System.out.println("Nome: " + getNome() +
                           "\nCPF: " + getCpf() +
                           "\nIdade: " + calcIdade(getDt_nasc()) +
                           "\nGenero: " + verifGenero(getGenero()) +
                           verifRegistro(isRegistro()));
    }
}
