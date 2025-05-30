package com.arbitra.model;

public class ArbitrageOpportunity {
    private String symbol;
    private String exchangeA;
    private String exchangeB;
    private double priceA;
    private double priceB;
    private double profitPercent;

    public ArbitrageOpportunity(String symbol, String exchangeA, String exchangeB, double priceA, double priceB, double profitPercent) {
        this.symbol = symbol;
        this.exchangeA = exchangeA;
        this.exchangeB = exchangeB;
        this.priceA = priceA;
        this.priceB = priceB;
        this.profitPercent = profitPercent;
    }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getExchangeA() { return exchangeA; }
    public void setExchangeA(String exchangeA) { this.exchangeA = exchangeA; }

    public String getExchangeB() { return exchangeB; }
    public void setExchangeB(String exchangeB) { this.exchangeB = exchangeB; }

    public double getPriceA() { return priceA; }
    public void setPriceA(double priceA) { this.priceA = priceA; }

    public double getPriceB() { return priceB; }
    public void setPriceB(double priceB) { this.priceB = priceB; }

    public double getProfitPercent() { return profitPercent; }
    public void setProfitPercent(double profitPercent) { this.profitPercent = profitPercent; }
}
