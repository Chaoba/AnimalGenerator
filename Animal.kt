interface Animal {
    /**
     * Get the legs number of this animal.
     *
     * @return the legs number.
     */
    fun getLegsNumber(): Integer

    /**
     * Whether this animal can fly or not.
     *
     * @return true if this animal can fly, otherwise false.
     */
    fun canFly(): Boolean

    /**
     * Whether this animal can swim or not.
     *
     * @return true is this animal can swim, otherwise false.
     */
    fun canSwim(): Boolean
}