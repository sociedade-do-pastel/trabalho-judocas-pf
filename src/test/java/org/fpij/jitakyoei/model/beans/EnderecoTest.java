package org.fpij.jitakyoei.model.beans;

import org.junit.Assert;
import org.junit.Test;

public class EnderecoTest {
    @Test
    public void inserirRuaValida() {
        Endereco e = new Endereco();
        e.setRua("Av. Humberto de Alencar Castelo Branco");
        Assert.assertEquals("Av. Humberto de Alencar Castelo Branco", e.getRua());
    }

    @Test(expected = Exception.class)
    public void inserirRuaInvalida() {
        Endereco e = new Endereco();
        e.setRua("123");
    }

    @Test(expected = Exception.class)
    public void inserirRuaVazia() {
        Endereco e = new Endereco();
        e.setRua(" ");
    }

    @Test(expected = Exception.class)
    public void inserirRuaNula() {
        Endereco e = new Endereco();
        e.setRua(null);
    }

    @Test
    public void inserirNumeroValido() {
        Endereco e = new Endereco();
        e.setNumero("3972-B");
        Assert.assertEquals("3972-B", e.getNumero());
    }

    @Test(expected = Exception.class)
    public void inserirNumeroInvalido() {
        Endereco e = new Endereco();
        e.setNumero("abcd");
    }

    @Test(expected = Exception.class)
    public void inserirNumeroVazio() {
        Endereco e = new Endereco();
        e.setNumero(" ");
    }

    @Test(expected = Exception.class)
    public void inserirNumeroNulo() {
        Endereco e = new Endereco();
        e.setNumero(null);
    }

    @Test
    public void inserirBairroValido() {
        Endereco e = new Endereco();
        e.setBairro("Assunção");
        Assert.assertEquals("Assunção", e.getBairro());
    }

    @Test(expected = Exception.class)
    public void inserirBairroInvalido() {
        Endereco e = new Endereco();
        e.setBairro("123");
    }

    @Test(expected = Exception.class)
    public void inserirBairroVazio() {
        Endereco e = new Endereco();
        e.setBairro(" ");
    }

    @Test(expected = Exception.class)
    public void inserirBairroNulo() {
        Endereco e = new Endereco();
        e.setBairro(null);
    }

    @Test
    public void inserirCidadeValida() {
        Endereco e = new Endereco();
        e.setCidade("São Bernardo do Campo");
        Assert.assertEquals("São Bernardo do Campo", e.getCidade());
    }

    @Test(expected = Exception.class)
    public void inserirCidadeInvalida() {
        Endereco e = new Endereco();
        e.setCidade("123");
    }

    @Test(expected = Exception.class)
    public void inserirCidadeVazia() {
        Endereco e = new Endereco();
        e.setCidade(" ");
    }

    @Test(expected = Exception.class)
    public void inserirCidadeNula() {
        Endereco e = new Endereco();
        e.setCidade(null);
    }

    @Test
    public void inserirEstadoValido() {
        Endereco e = new Endereco();
        e.setEstado("São Paulo");
        Assert.assertEquals("São Paulo", e.getEstado());
    }

    @Test(expected = Exception.class)
    public void inserirEstadoInvalido() {
        Endereco e = new Endereco();
        e.setEstado("123");
    }

    @Test(expected = Exception.class)
    public void inserirEstadoVazio() {
        Endereco e = new Endereco();
        e.setEstado(" ");
    }

    @Test(expected = Exception.class)
    public void inserirEstadoNulo() {
        Endereco e = new Endereco();
        e.setEstado(null);
    }

    @Test
    public void inserirCepValido() {
        Endereco e = new Endereco();
        e.setCep("09850-901");
        Assert.assertEquals("09850-901", e.getCep());
    }

    @Test(expected = Exception.class)
    public void inserirCepInvalido() {
        Endereco e = new Endereco();
        e.setCep("098BA-$01");
    }

    @Test(expected = Exception.class)
    public void inserirCepVazio() {
        Endereco e = new Endereco();
        e.setCep(" ");
    }

    @Test(expected = Exception.class)
    public void inserirCepNulo() {
        Endereco e = new Endereco();
        e.setCep(null);
    }
}
