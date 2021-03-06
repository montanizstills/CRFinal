package com.github.nez.myobject.financialobjects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.nez.myobject.MyObject;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Quote extends MyObject {
    private String symbol;
    private String companyName;
    private String primaryExchange;
    private String calculationPrice;
    private String open;
    private String openTime;
    private String close;
    private String closeTime;
    private String high;
    private String low;
    private String latestPrice;
    private String latestSource;
    private String latestTime;
    private String latestUpdate;
    private String latestVolume;
    private String volume;
    private String iexRealtimePrice;
    private String iexRealtimeSize;
    private String iexLastUpdated;
    private String delayedPrice;
    private String delayedPriceTime;
    private String extendedPrice;
    private String extendedChange;
    private String extendedChangePercent;
    private String extendedPriceTime;
    private String previousClose;
    private String previousVolume;
    private String change;
    private String changePercent;
    private String iexMarketPercent;
    private String iexVolume;
    private String avgTotalVolume;
    private String iexBidPrice;
    private String iexBidSize;
    private String iexAskPrice;
    private String iexAskSize;
    private String marketCap;
    private String week52High;
    private String week52Low;
    private String ytdChange;
    private String peRatio;
    private String lastTradeTime;
    private String isUSMarketOpen;

    public Quote(){}
    public Quote(String symbol, String companyName, String primaryExchange, String calculationPrice, String open, String openTime, String close, String closeTime, String high, String low, String latestPrice, String latestSource, String latestTime, String latestUpdate, String latestVolume, String volume, String iexRealtimePrice, String iexRealtimeSize, String iexLastUpdated, String delayedPrice, String delayedPriceTime, String extendedPrice, String extendedChange, String extendedChangePercent, String extendedPriceTime, String previousClose, String previousVolume, String change, String changePercent, String iexMarketPercent, String iexVolume, String avgTotalVolume, String iexBidPrice, String iexBidSize, String iexAskPrice, String iexAskSize, String marketCap, String week52High, String week52Low, String ytdChange, String peRatio, String lastTradeTime, String isUSMarketOpen) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.primaryExchange = primaryExchange;
        this.calculationPrice = calculationPrice;
        this.open = open;
        this.openTime = openTime;
        this.close = close;
        this.closeTime = closeTime;
        this.high = high;
        this.low = low;
        this.latestPrice = latestPrice;
        this.latestSource = latestSource;
        this.latestTime = latestTime;
        this.latestUpdate = latestUpdate;
        this.latestVolume = latestVolume;
        this.volume = volume;
        this.iexRealtimePrice = iexRealtimePrice;
        this.iexRealtimeSize = iexRealtimeSize;
        this.iexLastUpdated = iexLastUpdated;
        this.delayedPrice = delayedPrice;
        this.delayedPriceTime = delayedPriceTime;
        this.extendedPrice = extendedPrice;
        this.extendedChange = extendedChange;
        this.extendedChangePercent = extendedChangePercent;
        this.extendedPriceTime = extendedPriceTime;
        this.previousClose = previousClose;
        this.previousVolume = previousVolume;
        this.change = change;
        this.changePercent = changePercent;
        this.iexMarketPercent = iexMarketPercent;
        this.iexVolume = iexVolume;
        this.avgTotalVolume = avgTotalVolume;
        this.iexBidPrice = iexBidPrice;
        this.iexBidSize = iexBidSize;
        this.iexAskPrice = iexAskPrice;
        this.iexAskSize = iexAskSize;
        this.marketCap = marketCap;
        this.week52High = week52High;
        this.week52Low = week52Low;
        this.ytdChange = ytdChange;
        this.peRatio = peRatio;
        this.lastTradeTime = lastTradeTime;
        this.isUSMarketOpen = isUSMarketOpen;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPrimaryExchange() {
        return primaryExchange;
    }

    public void setPrimaryExchange(String primaryExchange) {
        this.primaryExchange = primaryExchange;
    }

    public String getCalculationPrice() {
        return calculationPrice;
    }

    public void setCalculationPrice(String calculationPrice) {
        this.calculationPrice = calculationPrice;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(String latestPrice) {
        this.latestPrice = latestPrice;
    }

    public String getLatestSource() {
        return latestSource;
    }

    public void setLatestSource(String latestSource) {
        this.latestSource = latestSource;
    }

    public String getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(String latestTime) {
        this.latestTime = latestTime;
    }

    public String getLatestUpdate() {
        return latestUpdate;
    }

    public void setLatestUpdate(String latestUpdate) {
        this.latestUpdate = latestUpdate;
    }

    public String getLatestVolume() {
        return latestVolume;
    }

    public void setLatestVolume(String latestVolume) {
        this.latestVolume = latestVolume;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIexRealtimePrice() {
        return iexRealtimePrice;
    }

    public void setIexRealtimePrice(String iexRealtimePrice) {
        this.iexRealtimePrice = iexRealtimePrice;
    }

    public String getIexRealtimeSize() {
        return iexRealtimeSize;
    }

    public void setIexRealtimeSize(String iexRealtimeSize) {
        this.iexRealtimeSize = iexRealtimeSize;
    }

    public String getIexLastUpdated() {
        return iexLastUpdated;
    }

    public void setIexLastUpdated(String iexLastUpdated) {
        this.iexLastUpdated = iexLastUpdated;
    }

    public String getDelayedPrice() {
        return delayedPrice;
    }

    public void setDelayedPrice(String delayedPrice) {
        this.delayedPrice = delayedPrice;
    }

    public String getDelayedPriceTime() {
        return delayedPriceTime;
    }

    public void setDelayedPriceTime(String delayedPriceTime) {
        this.delayedPriceTime = delayedPriceTime;
    }

    public String getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(String extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public String getExtendedChange() {
        return extendedChange;
    }

    public void setExtendedChange(String extendedChange) {
        this.extendedChange = extendedChange;
    }

    public String getExtendedChangePercent() {
        return extendedChangePercent;
    }

    public void setExtendedChangePercent(String extendedChangePercent) {
        this.extendedChangePercent = extendedChangePercent;
    }

    public String getExtendedPriceTime() {
        return extendedPriceTime;
    }

    public void setExtendedPriceTime(String extendedPriceTime) {
        this.extendedPriceTime = extendedPriceTime;
    }

    public String getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(String previousClose) {
        this.previousClose = previousClose;
    }

    public String getPreviousVolume() {
        return previousVolume;
    }

    public void setPreviousVolume(String previousVolume) {
        this.previousVolume = previousVolume;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(String changePercent) {
        this.changePercent = changePercent;
    }

    public String getIexMarketPercent() {
        return iexMarketPercent;
    }

    public void setIexMarketPercent(String iexMarketPercent) {
        this.iexMarketPercent = iexMarketPercent;
    }

    public String getIexVolume() {
        return iexVolume;
    }

    public void setIexVolume(String iexVolume) {
        this.iexVolume = iexVolume;
    }

    public String getAvgTotalVolume() {
        return avgTotalVolume;
    }

    public void setAvgTotalVolume(String avgTotalVolume) {
        this.avgTotalVolume = avgTotalVolume;
    }

    public String getIexBidPrice() {
        return iexBidPrice;
    }

    public void setIexBidPrice(String iexBidPrice) {
        this.iexBidPrice = iexBidPrice;
    }

    public String getIexBidSize() {
        return iexBidSize;
    }

    public void setIexBidSize(String iexBidSize) {
        this.iexBidSize = iexBidSize;
    }

    public String getIexAskPrice() {
        return iexAskPrice;
    }

    public void setIexAskPrice(String iexAskPrice) {
        this.iexAskPrice = iexAskPrice;
    }

    public String getIexAskSize() {
        return iexAskSize;
    }

    public void setIexAskSize(String iexAskSize) {
        this.iexAskSize = iexAskSize;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getWeek52High() {
        return week52High;
    }

    public void setWeek52High(String week52High) {
        this.week52High = week52High;
    }

    public String getWeek52Low() {
        return week52Low;
    }

    public void setWeek52Low(String week52Low) {
        this.week52Low = week52Low;
    }

    public String getYtdChange() {
        return ytdChange;
    }

    public void setYtdChange(String ytdChange) {
        this.ytdChange = ytdChange;
    }

    public String getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(String peRatio) {
        this.peRatio = peRatio;
    }

    public String getLastTradeTime() {
        return lastTradeTime;
    }

    public void setLastTradeTime(String lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public String getIsUSMarketOpen() {
        return isUSMarketOpen;
    }

    public void setIsUSMarketOpen(String isUSMarketOpen) {
        this.isUSMarketOpen = isUSMarketOpen;
    }
}
