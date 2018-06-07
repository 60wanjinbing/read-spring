protected void initStrategies(ApplicationContext context) {
		initMultipartResolver(context);
		initLocaleResolver(context);
		initThemeResolver(context);
		initHandlerMappings(context);
		initHandlerAdapters(context);
		initHandlerExceptionResolvers(context);
		initRequestToViewNameTranslator(context);
		initViewResolvers(context);
		initFlashMapManager(context);
	}
HandlerExecutionChain mappedHandler
DispatchSerlet中doDispatch中，是先依据request找到mappinghandle,再依据mappingHandle找到处理的Adapter，最后由handleAdapter，
去处理Controler中的method，返回ModelAndView,继续往下执行。
