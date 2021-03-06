import java.util.List;
class BuilderWithToBuilderWithSetterPrefix<T> {
	private String mOne;
	private String mTwo;
	private T foo;
	private List<T> bars;
	public static <K> K rrr(BuilderWithToBuilderWithSetterPrefix<K> x) {
		return x.foo;
	}
	@java.lang.SuppressWarnings("all")
	BuilderWithToBuilderWithSetterPrefix(final String one, final String two, final T foo, final List<T> bars) {
		this.mOne = one;
		this.mTwo = two;
		this.foo = foo;
		this.bars = bars;
	}
	@java.lang.SuppressWarnings("all")
	public static class BuilderWithToBuilderWithSetterPrefixBuilder<T> {
		@java.lang.SuppressWarnings("all")
		private String one;
		@java.lang.SuppressWarnings("all")
		private String two;
		@java.lang.SuppressWarnings("all")
		private T foo;
		@java.lang.SuppressWarnings("all")
		private java.util.ArrayList<T> bars;
		@java.lang.SuppressWarnings("all")
		BuilderWithToBuilderWithSetterPrefixBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderWithSetterPrefixBuilder<T> withOne(final String one) {
			this.one = one;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderWithSetterPrefixBuilder<T> withTwo(final String two) {
			this.two = two;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderWithSetterPrefixBuilder<T> withFoo(final T foo) {
			this.foo = foo;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderWithSetterPrefixBuilder<T> withBar(final T bar) {
			if (this.bars == null) this.bars = new java.util.ArrayList<T>();
			this.bars.add(bar);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderWithSetterPrefixBuilder<T> withBars(final java.util.Collection<? extends T> bars) {
			if (this.bars == null) this.bars = new java.util.ArrayList<T>();
			this.bars.addAll(bars);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderWithSetterPrefixBuilder<T> clearBars() {
			if (this.bars != null) this.bars.clear();
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderWithToBuilderWithSetterPrefix<T> build() {
			java.util.List<T> bars;
			switch (this.bars == null ? 0 : this.bars.size()) {
			case 0: 
				bars = java.util.Collections.emptyList();
				break;
			case 1: 
				bars = java.util.Collections.singletonList(this.bars.get(0));
				break;
			default: 
				bars = java.util.Collections.unmodifiableList(new java.util.ArrayList<T>(this.bars));
			}
			return new BuilderWithToBuilderWithSetterPrefix<T>(one, two, foo, bars);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "BuilderWithToBuilderWithSetterPrefix.BuilderWithToBuilderWithSetterPrefixBuilder(one=" + this.one + ", two=" + this.two + ", foo=" + this.foo + ", bars=" + this.bars + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static <T> BuilderWithToBuilderWithSetterPrefixBuilder<T> builder() {
		return new BuilderWithToBuilderWithSetterPrefixBuilder<T>();
	}
	@java.lang.SuppressWarnings("all")
	public BuilderWithToBuilderWithSetterPrefixBuilder<T> toBuilder() {
		final BuilderWithToBuilderWithSetterPrefixBuilder<T> builder = new BuilderWithToBuilderWithSetterPrefixBuilder<T>().withOne(this.mOne).withTwo(this.mTwo).withFoo(BuilderWithToBuilderWithSetterPrefix.<T>rrr(this));
		if (this.bars != null) builder.withBars(this.bars);
		return builder;
	}
}
class ConstructorWithToBuilderWithSetterPrefix<T> {
	private String mOne;
	private String mTwo;
	private T foo;
	@lombok.Singular
	private com.google.common.collect.ImmutableList<T> bars;
	public ConstructorWithToBuilderWithSetterPrefix(String mOne, T baz, com.google.common.collect.ImmutableList<T> bars) {
	}
	@java.lang.SuppressWarnings("all")
	public static class ConstructorWithToBuilderWithSetterPrefixBuilder<T> {
		@java.lang.SuppressWarnings("all")
		private String mOne;
		@java.lang.SuppressWarnings("all")
		private T baz;
		@java.lang.SuppressWarnings("all")
		private com.google.common.collect.ImmutableList<T> bars;
		@java.lang.SuppressWarnings("all")
		ConstructorWithToBuilderWithSetterPrefixBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public ConstructorWithToBuilderWithSetterPrefixBuilder<T> withMOne(final String mOne) {
			this.mOne = mOne;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public ConstructorWithToBuilderWithSetterPrefixBuilder<T> withBaz(final T baz) {
			this.baz = baz;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public ConstructorWithToBuilderWithSetterPrefixBuilder<T> withBars(final com.google.common.collect.ImmutableList<T> bars) {
			this.bars = bars;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public ConstructorWithToBuilderWithSetterPrefix<T> build() {
			return new ConstructorWithToBuilderWithSetterPrefix<T>(mOne, baz, bars);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "ConstructorWithToBuilderWithSetterPrefix.ConstructorWithToBuilderWithSetterPrefixBuilder(mOne=" + this.mOne + ", baz=" + this.baz + ", bars=" + this.bars + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static <T> ConstructorWithToBuilderWithSetterPrefixBuilder<T> builder() {
		return new ConstructorWithToBuilderWithSetterPrefixBuilder<T>();
	}
	@java.lang.SuppressWarnings("all")
	public ConstructorWithToBuilderWithSetterPrefixBuilder<T> toBuilder() {
		return new ConstructorWithToBuilderWithSetterPrefixBuilder<T>().withMOne(this.mOne).withBaz(this.foo).withBars(this.bars);
	}
}
