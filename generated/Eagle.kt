/**
 * Class for animal Eagle
 */
class Eagle() : Bird {
    /**
     * Get the legs number of this animal.
     *
     * @return the legs number.
     */
    override fun getLegsNumber(): Integer = 2

    /**
     * Whether this animal can fly or not.
     *
     * @return true if this animal can fly, otherwise false.
     */
    override fun canFly(): Boolean = true

    /**
     * Whether this animal can swim or not.
     *
     * @return true is this animal can swim, otherwise false.
     */
    override fun canSwim(): Boolean {
        return false
    }
}
