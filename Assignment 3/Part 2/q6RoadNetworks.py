class TupleCity:
    def __init__(self, c1, c2):
        self.city_1 = c1
        self.city_2 = c2


def num_networks(towns, tuples):
    map = {}
    for town in towns:
        map[town] = []
    
    for tuple_city in tuples:
        cities1 = map.get(tuple_city.city_1)
        cities2 = map.get(tuple_city.city_2)
        cities1.append(tuple_city.city_2)
        cities2.append(tuple_city.city_1)
        map[tuple_city.city_1] = cities1
        map[tuple_city.city_2] = cities2
    
    print(map.items())
    
    return 0


list_towns = ["Skagway", "Juneau", "Gustavus", "Homer", "Port Alsworth", "Glacier Bay", "Fairbanks", "McCarthy", "Copper Center", "Healy"]
list_tuples = [
    TupleCity("Anchorage", "Homer"),
    TupleCity("Glacier Bay", "Gustavus"),
    TupleCity("Copper Center", "McCarthy"),
    TupleCity("Anchorage", "Copper Center"),
    TupleCity("Copper Center", "Fairbanks"),
    TupleCity("Healy", "Fairbanks"),
    TupleCity("Healy", "Anchorage")
]
num_networks(list_towns, list_tuples)
