package me.grooming.GroomingRepository.DesignPatternImplementation.CreationalDesignPatternImplementation.BuilderImplementation;

public class HouseBluePrint {

	private int[] bedroomDimensions;
	private int[] kitchenDimensions;
	private int[] lawnDimensions;
	private int[] garageDimensions;
	private int[] balconyDimensions;
	private int[] livingroomDimensions;

	public int[] getBedroomDimensions() {

		return bedroomDimensions;

	}

	public int[] getKitchenDimensions() {

		return kitchenDimensions;

	}

	public int[] getLawnDimensions() {

		return lawnDimensions;

	}

	public int[] getGarageDimensions() {

		return garageDimensions;

	}

	public int[] getBalconyDimensions() {

		return balconyDimensions;

	}

	public int[] getLivingroomDimensions() {

		return livingroomDimensions;

	}

	public HouseBluePrint(HouseBluePrintBuilder houseBluePrintBuilder) {

		this.bedroomDimensions = houseBluePrintBuilder.bedroomDimensions;
		this.kitchenDimensions = houseBluePrintBuilder.kitchenDimensions;
		this.balconyDimensions = houseBluePrintBuilder.balconyDimensions;
		this.lawnDimensions = houseBluePrintBuilder.lawnDimensions;
		this.garageDimensions = houseBluePrintBuilder.garageDimensions;
		this.livingroomDimensions = houseBluePrintBuilder.livingroomDimensions;

	}

	public static class HouseBluePrintBuilder {

		private int[] bedroomDimensions;
		private int[] kitchenDimensions;
		private int[] lawnDimensions;
		private int[] garageDimensions;
		private int[] balconyDimensions;
		private int[] livingroomDimensions;

		public static HouseBluePrintBuilder createBluePrint() {

			return new HouseBluePrintBuilder();

		}

		private HouseBluePrintBuilder() {

		}

		public HouseBluePrintBuilder withBedroomDimensions(int[] bedroomDimensions) {

			this.bedroomDimensions = bedroomDimensions;

			return this;

		}

		public HouseBluePrintBuilder withKitchenDimensions(int[] kitchenDimensions) {

			this.kitchenDimensions = kitchenDimensions;

			return this;

		}

		public HouseBluePrintBuilder withBalconyDimensions(int[] balconyDimensions) {

			this.balconyDimensions = balconyDimensions;

			return this;

		}

		public HouseBluePrintBuilder withLawnDimensions(int[] lawnDimensions) {

			this.lawnDimensions = lawnDimensions;

			return this;

		}

		public HouseBluePrintBuilder withGarageDimensions(int[] garageDimensions) {

			this.garageDimensions = garageDimensions;

			return this;

		}

		public HouseBluePrintBuilder withLivingroomDimensions(int[] livingroomDimensions) {

			this.livingroomDimensions = livingroomDimensions;

			return this;

		}

		public HouseBluePrint build() {

			return new HouseBluePrint(this);

		}

	}

}