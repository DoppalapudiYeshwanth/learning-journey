function Greeting({name, textColor}){
    let styles = {color : textColor};
    return(
        <p style={styles}>Hello {name}</p>
    )
}
export default Greeting;