package com.example.designPatterns;
import java.util.ArrayList;
import java.util.List;

class Vehicle implements Cloneable {
	private List<String> vehiclesList;

	public Vehicle() {
		this.vehiclesList = new ArrayList<String>();
	}

	public void insertData() {
		vehiclesList.add("Bugati");
		vehiclesList.add("Ferrari");
		vehiclesList.add("BMW");
		vehiclesList.add("Mercedes");
	}

	public Vehicle(List<String> list) {
		this.vehiclesList = list;
	}

	public List<String> getVehiclesList() {
		return this.vehiclesList;
	}

	public Object clone() throws CloneNotSupportedException {

		List<String> tempList = new ArrayList<String>();
		for (String s : this.vehiclesList) {
			tempList.add(s);
		}

		return new Vehicle(tempList);
	}

}

class PrototypeExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle vehicle1 = new Vehicle();

		vehicle1.insertData();

		Vehicle vehicle2 = (Vehicle) vehicle1.clone();

		List<String> list = vehicle2.getVehiclesList();

		System.out.println("before adding a element" + list);

		list.add("RolseRoyse");

		System.out.println(list + "after adding a element");

	}

}