from abc import ABC, abstractmethod

class Pizza(ABC):
    @abstractmethod
    def cost(self):
        pass

class Margherita(Pizza):
    def cost(self):
        return 10.0

class Pepperoni(Pizza):
    def cost(self):
        return 12.0

def main():
    margherita = Margherita()
    pepperoni = Pepperoni()
    
    print(f"Margherita pizza costs: ${margherita.cost()}")
    print(f"Pepperoni pizza costs: ${pepperoni.cost()}")

if __name__ == "__main__":
    main()
