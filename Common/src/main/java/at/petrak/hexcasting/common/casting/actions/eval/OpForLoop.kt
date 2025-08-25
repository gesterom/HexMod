package at.petrak.hexcasting.common.casting.actions.eval

import at.petrak.hexcasting.api.casting.asActionResult
import at.petrak.hexcasting.api.casting.castables.ConstMediaAction
import at.petrak.hexcasting.api.casting.eval.CastingEnvironment
import at.petrak.hexcasting.api.casting.iota.Iota
import at.petrak.hexcasting.api.casting.iota.DoubleIota
import at.petrak.hexcasting.api.casting.getDouble

object OpForLoop : ConstMediaAction {
    override val argc = 1
    override fun execute(args: List<Iota>, env: CastingEnvironment): List<Iota> {
        val n = args.getDouble(0, argc).toInt()  // Truncate the double to an integer
        val res = List(n) { i -> DoubleIota(i.toDouble()) }  // Create list of DoubleIota(0.0), ..., DoubleIota(n-1.0)
        return res
    }
}