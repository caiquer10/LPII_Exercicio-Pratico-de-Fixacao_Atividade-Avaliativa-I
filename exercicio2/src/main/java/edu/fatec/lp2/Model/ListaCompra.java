package edu.fatec.lp2.Model;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.lp2.Service.Calculavel;

public class ListaCompra implements Calculavel
{
    private List<ItemCompra> itensCompra = new ArrayList<>();
    private int quantidadedeMax;

    public ListaCompra(int quantidadedeMax)
    {
        this.quantidadedeMax = quantidadedeMax;
    }

    public void incluir(ItemCompra produto)
    {
        if (itensCompra.size() < quantidadedeMax)
            this.itensCompra.add(produto);
    }

    public double calcularPreco()
    {
        double total = 0.0;
        for (ItemCompra itemCompra : itensCompra)
        {
            total += itemCompra.calcularPreco();
        }

        return total;
    }
}
