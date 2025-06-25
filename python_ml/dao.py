class stock:
    def __init__(self, ticker, name_of_stock, price_at_Begin,price_at_midday,price_at_close,price_on_afterhours,to_buy,to_sell,to_hold)

class StockDAO:
    def __init__(self, connection):
        self.connection = connection
        self.cursor = connection.curspr()
    def create(self, stock):
        sql - "INSERT INTO stocks (stock_id,ticker,name_of_stock,price_at_Begin,price_at_miday,pirce_at_close,price_on_afterhours,to_buy,to_sell,to_hold) VALUES (%S,%S,%f,%f,%f,%f,%b
