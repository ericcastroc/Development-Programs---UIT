"""3 -Escreva um programa em Python que print os três tens com valor mais alto do dicionário
dicionário: {'item1': 45.50, 'item2':35, 'item3': 41.30, 'item4':55, 'item5': 24}
Saída:
item4 55
item1 45.5
item3 41.3"""

import heapq
d1 = {'item 1': 45.50, 'item 2': 35, 'item 3': 41.30, 'item 4': 55, 'item 5': 24}
print(heapq.nlargest(3, d1.items(), key=lambda x: x[1]))

