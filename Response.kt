package com.example.covid_tracker

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("cases_time_series")
	val casesTimeSeries: List<CasesTimeSeriesItem?>? = null,

	@field:SerializedName("tested")
	val tested: List<TestedItem?>? = null,

	@field:SerializedName("statewise")
	val statewise: List<StatewiseItem?>? = null
)

data class CasesTimeSeriesItem(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("dailyrecovered")
	val dailyrecovered: String? = null,

	@field:SerializedName("totalconfirmed")
	val totalconfirmed: String? = null,

	@field:SerializedName("totaldeceased")
	val totaldeceased: String? = null,

	@field:SerializedName("dailydeceased")
	val dailydeceased: String? = null,

	@field:SerializedName("totalrecovered")
	val totalrecovered: String? = null,

	@field:SerializedName("dailyconfirmed")
	val dailyconfirmed: String? = null
)

data class TestedItem(

	@field:SerializedName("totalsamplestested")
	val totalsamplestested: String? = null,

	@field:SerializedName("positivecasesfromsamplesreported")
	val positivecasesfromsamplesreported: String? = null,

	@field:SerializedName("samplereportedtoday")
	val samplereportedtoday: String? = null,

	@field:SerializedName("source1")
	val source1: String? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("testsperconfirmedcase")
	val testsperconfirmedcase: String? = null,

	@field:SerializedName("individualstestedperconfirmedcase")
	val individualstestedperconfirmedcase: String? = null,

	@field:SerializedName("testpositivityrate")
	val testpositivityrate: String? = null,

	@field:SerializedName("testsconductedbyprivatelabs")
	val testsconductedbyprivatelabs: String? = null,

	@field:SerializedName("testedasof")
	val testedasof: String? = null,

	@field:SerializedName("testspermillion")
	val testspermillion: String? = null,

	@field:SerializedName("updatetimestamp")
	val updatetimestamp: String? = null,

	@field:SerializedName("totalindividualstested")
	val totalindividualstested: String? = null,

	@field:SerializedName("totalpositivecases")
	val totalpositivecases: String? = null
)

data class StatewiseItem(

	@field:SerializedName("statenotes")
	val statenotes: String? = null,

	@field:SerializedName("recovered")
	val recovered: String? = null,

	@field:SerializedName("deltadeaths")
	val deltadeaths: String? = null,

	@field:SerializedName("migratedother")
	val migratedother: String? = null,

	@field:SerializedName("deltarecovered")
	val deltarecovered: String? = null,

	@field:SerializedName("active")
	val active: String? = null,

	@field:SerializedName("deltaconfirmed")
	val deltaconfirmed: String? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("statecode")
	val statecode: String? = null,

	@field:SerializedName("confirmed")
	val confirmed: String? = null,

	@field:SerializedName("deaths")
	val deaths: String? = null,

	@field:SerializedName("lastupdatedtime")
	val lastupdatedtime: String? = null
)
