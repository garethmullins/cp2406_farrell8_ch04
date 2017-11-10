class DebugBox
{
    private int width;
    private int length;
    private int height;

    DebugBox()
    {
        this(1,1,1);
    }
    DebugBox(int width, int length, int height)
    {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    void showData()
    {
        System.out.println("Width: "  + width + "  Length: " + length + "  Height: " + height);
    }
    double getVolume()
    {
        return (length * width * height);
    }
}
