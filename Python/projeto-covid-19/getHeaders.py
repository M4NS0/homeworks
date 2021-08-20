import csv
from typing import List, Any

headers: List[Any]= []

with open("data.csv", "r") as source:
    reader = csv.reader(source, delimiter=';')
    headers = next(reader)

