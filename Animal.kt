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
}