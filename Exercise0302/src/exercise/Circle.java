/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author ASUS
 */
public class Circle {
		private double radius;
		public Circle() {
			this.radius = 1.0;
		}
		public Circle(double radius) {
			super();
			this.radius = radius;
		}
		public double getRadius() {
			return radius;
		}
		/**
15.		 * Calculate circle area based on radius.
16.		 * @return the area value of circle.
17.		 */
		public double getArea() {
			return Math.PI * Math.pow(radius, 2);
		}
}
