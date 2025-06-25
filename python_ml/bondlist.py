from operator import itemgetter

''' This is going to be a list of Bonds in which I am going to keep for the whole time and keep track of the days until they are done'''

hasbro_bond = 'HAS 5.1% 05/15/2044'
intel_big_bond = 'INTC 5.9% 02/10/2063'
comcast_bond="CMCSA 4.94% 10/15/2058"
apple_big_bond="AAPL 2.95% 09/11/2049"
amazon_bond ="AMZN 3.25% 05/12/2061"
ust_bond = "UST 1.25% 05/15/2050"
pemex_bond = "PEMEX 6.375% 01/23/2045"
apple_small_bond = "AAPL 2.4% 08/20/2050"
intel_small_bond = "INTC 5.625 02/10/2043"
google_bond = "GOOGL 2.05% 08/15/2050"
amd_bond= "AMD 4.393% 06/01/2052"
nvida_bigger_bond = "NVDA 3.5% 04/01/2050"
disney_bond = "DIS 7.75% 12/01/2045"
ford_bond = "F 7.45% 07/16/2031"
nvida_small_bond= "NVDA 2.85% 04/01/2030"
bond_split_list= [hasbro_bond.split(' '),intel_big_bond.split(' '),comcast_bond.split(' '),apple_big_bond.split(' '),amazon_bond.split(' '),ust_bond.split(' '),pemex_bond.split(' '),apple_small_bond.split(' '),intel_small_bond.split(' '),google_bond.split(' '),amd_bond.split(' '),nvida_bigger_bond.split(' '),disney_bond.split(' '),ford_bond.split(' '),nvida_small_bond.split(' ')]
bond_dict = {}
keylist = ['HAS','INTC L','CMCSA','AAPL L','AMZN','UST','PEMEX','AAPL S','INTC S','GOOGL','AMD','NVDA L','DIS','F','NVDA S']
order_key_list=sorted(keylist,key=itemgetter(0))
order_split_bond_list=sorted(bond_split_list,key=itemgetter(0))
bond_dict = dict(zip(keylist,bond_split_list))
for k,v in bond_dict.items():
    print (k,v)
print(order_split_bond_list)
print(keylist)
print(bond_split_list) 
