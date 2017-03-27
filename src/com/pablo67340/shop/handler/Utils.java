package com.pablo67340.shop.handler;



public final class Utils {

	private static boolean signsOnly;

	@SuppressWarnings("unused")
	private static String added, cantSell, prefix, purchased, menuName, notEnoughPre, notEnoughPost, 
	signTitle, sellCommand, sellTitle, sold, taken;
	
	private static Boolean escapeOnly;

	/**
	 * The text that represents what comes before
	 * messages sent to the {@link Player}.
	 * <p>
	 * i.e. [GUIShop] 
	 * 
	 * @return the {@link Shop}'s prefix.
	 */
	public static String getPrefix() {
		return prefix;
	}

	/**
	 * Sets the text that represents what comes
	 * before messages sent to the {@link Player}.
	 * 
	 * @param prefix
	 * 		The text to set.
	 */
	public static void setPrefix(String text) {
		prefix = text;
	}

	/**
	 * Gets the name of the {@link Menu}.
	 * 
	 * @return the menu's name.
	 */
	public static String getMenuName() {
		return menuName;
	}

	/**
	 * Sets the name of the {@link Menu}.
	 * 
	 * @param text
	 * 		The text to set.
	 */
	public static void setMenuName(String text) {
		menuName = text;
	}

	/**
	 * Gets the title of the {@link Sell} menu.
	 * 
	 * @return the title of the sell menu.
	 */
	public static String getSellTitle() {
		return sellTitle;
	}

	/**
	 * Sets the title of the {@link Sell} menu.
	 * 
	 * @param text
	 * 		The text to set.
	 */
	public static void setSellTitle(String text) {
		sellTitle = text;
	}

	/**
	 * Gets the title on the sign that
	 * handles the {@link Shop}.
	 * 
	 * @return the sign's title.
	 */
	public static String getSignTitle() {
		return signTitle;
	}

	/**
	 * Sets the title on the sign that
	 * handles the {@link Shop}.
	 * 
	 * @param text
	 */
	public static void setSignTitle(String text) {
		signTitle = text;
	}


	/**
	 * Sets if shops close with escape
	 * handles the {@link Shop}.
	 * 
	 * @param boolean
	 */
	public static void setEscapeOnly(Boolean input){
		escapeOnly = input;
	}
	
	/**
	 * Gets whether the {@link Shop} is closed with
	 * the escape key
	 * 
	 * @return {@code true} will be closed
	 * when the escape key is pressed,
	 * 		   otherwise, {@code false}.
	 */
	public static Boolean getEscapeOnly(){
		return escapeOnly;
	}
	
	
	/**
	 * Gets whether the {@link Shop} can
	 * only be opened from a sign.
	 * 
	 * @return {@code true} if the shop can
	 * 		   only be opened from a sign,
	 * 		   otherwise, {@code false}.
	 */
	public static boolean isSignsOnly() {
		return signsOnly;
	}

	/**
	 * Sets whether the {@link Shop} can
	 * only be opened from a sign.
	 * 
	 * @param flag
	 * 		The flag to set.
	 */
	public static void setSignsOnly(boolean flag) {
		signsOnly = flag;
	}

	public static String getNotEnoughPre() {
		return notEnoughPre;
	}

	public static void setNotEnoughPre(String text) {
		notEnoughPre = text;
	}

	public static String getNotEnoughPost() {
		return notEnoughPost;
	}

	public static void setNotEnoughPost(String text) {
		notEnoughPost = text;
	}

	public static String getPurchased() {
		return purchased;
	}

	public static void setPurchased(String text) {
		purchased = text;
	}

	public static String getTaken() {
		return taken;
	}

	public static void setTaken(String text) {
		taken = text;
	}

	public static String getSold() {
		return sold;
	}

	public static void setSold(String text) {
		sold = text;
	}

	public static String getAdded() {
		return added;
	}

	public static void setAdded(String text) {
		added = text;
	}

	public static String getCantSell() {
		return cantSell;
	}

	public static void setCantSell(String text) {
		cantSell = text;
	}

}