class Vehicle:
    def __init__(self, DriveStrategy):
        self.DriveStrategy = DriveStrategy
        
    
    def drive(self):
        self.DriveStrategy.drive()
    
    