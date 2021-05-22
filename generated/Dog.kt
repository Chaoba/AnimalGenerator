/**
 * Class for animal Dog
 */
class Dog() : Mammal {
    /**
     * Get the legs number of this animal.
     *
     * @return the legs number.
     */
    override fun getLegsNumber(): Integer = 4

    /**
     * Whether this animal can fly or not.
     *
     * @return true if this animal can fly, otherwise false.
     */
    override fun canFly(): Boolean = false

    /**
     * Whether this animal can swim or not.
     *
     * @return true is this animal can swim, otherwise false.
     */
    override fun canSwim(): Boolean {
        return true
    }
}
