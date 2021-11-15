/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.model;

/**
 *
 * @author usuario
 */
public class funcionario {
    private String CPFFuncionario, NomeFuncionario, TelefoneFuncionario, EmailFuncionario,Cargo, CodigoFuncionario, IdadeFuncionario, CargaHorariaDia, Salario;
    
    public funcionario() {
        this.CPFFuncionario = "";
        this.NomeFuncionario = "";
        this.TelefoneFuncionario = "";
        this.EmailFuncionario = "";
        this.Cargo = "";
        this.CodigoFuncionario = "";
        this.IdadeFuncionario = "";
        this.CargaHorariaDia = "";
        this.Salario = "";
    }
    public funcionario(String CPFFuncionario, String NomeFuncionario, String TelefoneFuncionario, String EmailFuncionario, String Cargo, String CodigoFuncionario, String IdadeFuncionario, String CargaHorariaDia, String Salario) {
        this.CPFFuncionario = CPFFuncionario;
        this.NomeFuncionario = NomeFuncionario;
        this.TelefoneFuncionario = TelefoneFuncionario;
        this.EmailFuncionario = EmailFuncionario;
        this.Cargo = Cargo;
        this.CodigoFuncionario = CodigoFuncionario;
        this.IdadeFuncionario = IdadeFuncionario;
        this.CargaHorariaDia = CargaHorariaDia;
        this.Salario = Salario;
    }

    public String getCPFFuncionario() {
        return CPFFuncionario;
    }

    public void setCPFFuncionario(String CPFFuncionario) {
        this.CPFFuncionario = CPFFuncionario;
    }

    public String getNomeFuncionario() {
        return NomeFuncionario;
    }

    public void setNomeFuncionario(String NomeFuncionario) {
        this.NomeFuncionario = NomeFuncionario;
    }

    public String getTelefoneFuncionario() {
        return TelefoneFuncionario;
    }

    public void setTelefoneFuncionario(String TelefoneFuncionario) {
        this.TelefoneFuncionario = TelefoneFuncionario;
    }

    public String getEmailFuncionario() {
        return EmailFuncionario;
    }

    public void setEmailFuncionario(String EmailFuncionario) {
        this.EmailFuncionario = EmailFuncionario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCodigoFuncionario() {
        return CodigoFuncionario;
    }

    public void setCodigoFuncionario(String CodigoFuncionario) {
        this.CodigoFuncionario = CodigoFuncionario;
    }

    public String getIdadeFuncionario() {
        return IdadeFuncionario;
    }

    public void setIdadeFuncionario(String IdadeFuncionario) {
        this.IdadeFuncionario = IdadeFuncionario;
    }

    public String getCargaHorariaDia() {
        return CargaHorariaDia;
    }

    public void setCargaHorariaDia(String CargaHorariaDia) {
        this.CargaHorariaDia = CargaHorariaDia;
    }

    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }
    
}
