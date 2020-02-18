package entities;

import entidade.en.Color;

public class Circle extends Shape {

	private Double radius; // raio

	public Circle() {
		super();

	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {

		return Math.PI * radius * radius;
	} // pi x raio ²

}
