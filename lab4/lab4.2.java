public class ComplexNumber {
    private double real;  // действительная часть
    private double imag;  // мнимая часть
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    // Комплексно-сопряженное: a+bi → a-bi
    public ComplexNumber conjugate() {
        return new ComplexNumber(real, -imag);
    }
    // Геттеры
    public double getReal() { return real; }
    public double getImag() { return imag; }
    @Override
    public String toString() {
        return String.format("(%.2f%+.2fi)", real, imag);
    }
}
