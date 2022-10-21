package dev.gggedr.oberon.math.utls

class RandomUtils {

    companion object {
        /**
         * Returns a random Integer number between min and max, inclusive.
         *
         * @param min Minimum value
         * @param max Maximum value. Must be greater than min.
         */
        fun randomInt(min: Int, max: Int): Int {
            if(min >= max) {
                throw IllegalArgumentException("Max must be greater than min")
            }

            return (Math.random() * (max - min) + min).toInt()
        }

        /**
         * Returns a random Float number between min and max, inclusive.
         *
         * @param min Minimum value
         * @param max Maximum value. Must be greater than min.
         */
        fun randomFloat(min: Float, max: Float): Float {
            if(min >= max) {
                throw IllegalArgumentException("Max must be greater than min")
            }

            return (Math.random() * (max - min) + min).toFloat()
        }

        /**
         * Returns a random Double number between min and max, inclusive.
         *
         * @param min Minimum value
         * @param max Maximum value. Must be greater than min.
         */
        fun randomDouble(min: Double, max: Double): Double {
            if(min >= max) {
                throw IllegalArgumentException("Max must be greater than min")
            }

            return Math.random() * (max - min) + min
        }

        /**
         * Returns a random Boolean value.
         */
        fun randomBoolean(): Boolean {
            return Math.random() < 0.5
        }

        /**
         * Returns a random Color.
         */
        fun randomColor(): Int {
            return randomInt(0, 0xFFFFFF)
        }

        /**
         * Returns a random Color with the specified alpha value.
         *
         * @param alpha Alpha value, between 0 and 255.
         */
        fun randomColor(alpha: Int): Int {
            return randomInt(0, 0xFFFFFF) or (alpha shl 24)
        }
    }

}