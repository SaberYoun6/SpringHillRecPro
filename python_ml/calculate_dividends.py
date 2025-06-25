jeq_dividend = .1100
total_stock_amount_of_jeq = 19.43819
jeq_stock_increase_at_currnet= total_stock_amount_of_jeq * jeq_dividend 
jeq_current_price= 5.94 
jeq_total_amount_of_cash_currently = total_stock_amount_of_jeq * jeq_current_price 

jeq_total_amount_of_cash_including_mar_div= jeq_total_amount_of_cash_currently+jeq_stock_increase_at_currnet 
jeq_total_amount_of_stock_including_mar_div = jeq_total_amount_of_cash_including_mar_div / jeq_current_price 

print(jeq_total_amount_of_cash_including_mar_div)
print(jeq_total_amount_of_stock_including_mar_div)

for i in range(1,101):

