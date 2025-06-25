import ctypes
import yfinances as yf

grnd=yf.ticker("GRND")
grnd.get_analyst_price_targets()
yf.download("GRND",START="2023-7-10",END="2025-06-30",keepna=True)

def grinderpoint(c_int boughtone, w_charp purchasedate, c_int boughttwo, w_charp purchasedate2):
    `
oneshareofgrindr=(5.14+(6*18.35))/7
currentpriceofgrindr=23.60

for i in range(0,100):
    saladgrindr=(oneshareofgrindr+currentpriceofgrindr*i)/(1+i)
    priceofgrindr = currentpriceofgrindr*i
    print("instance of iterable: %d, average price: %f, this is the price I'm going to be paying if I buy grindr %f " %(i,saladgrindr,priceofgrindr))
