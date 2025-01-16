from Vehicle import Vehicle
from Strategy.NormalDriveStrategy import NormalDriveStrategy

class NormalVehicle(Vehicle):
    def __init__(self):
        super().__init__(NormalDriveStrategy())
