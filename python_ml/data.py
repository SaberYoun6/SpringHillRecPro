""" this will read in each file and try to keep track of all location and races , ages and genders per a year of heat related emergency
"""
from sklearn.preprocessing import MinMaxScaler
import pandas as pd
import numpy as np

class DataChecker:
    def __init__(self,file):
        self.file = file
    def file_checker(self):
        try: 
            files = open(self.file,"r")
            content = files.read()
            print(content)
        except FileNotFoundError:
            print("Error: File not found.")
        except PermissionError:
            print("Error: Permission denied.")
        except IOError:
            print("Error: Input/output error.")
        except ValueError:
            print("Error: Invalid argument.")
        finally:
            if 'files' in locals() and not files.closed:
                files.close()

class DataTransformation(DataChecker):
    def __init__(self,file):
        '''
        self.data = data
        '''
        self.file = file
        
        '''
        self.star = star
        '''
    def reading_data(self):
        df = pd.read_excel(self.file,sheet_name=None)
        return df
    def dataframe_sheets(self,sheetsnumber):
        df =  self.reading_data()
        sheetnumber= "Sheet" + str(sheetsnumber)
        df_sheet= df[sheetnumber]
        return df_sheet
    def ridden_of_the_stars(self,sheetnumber):
        df = self.dataframe_sheets(sheetnumber)
        df_replace_star=df.replace("*",0)
        return df_replace_star
   




data_sheet1 = DataTransformation("patterning_table.ods")
print(data_sheet1.file_checker())
print(data_sheet1.reading_data())
data=data_sheet1.ridden_of_the_stars(1)
data_sheetone = data_sheet1.dataframe_sheets(1)
print(data_sheetone)
print(data)
scaler = MinMaxScaler(feature_range(0,1520)
scaled_data = scaler.fit_transform(data)

print(scaled_data)

print(dataTest)



